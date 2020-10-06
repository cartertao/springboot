package com.springboot.tao.controller;

import com.springboot.tao.bean.db.Sessions;
import com.springboot.tao.dao.SessionsMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

/**
 * @author taozhiwei
 * @date 2020/9/1 16:49
 */
@RestController
@RequestMapping("/shiro")
public class ShiroController {

    @Autowired
    SessionsMapper sessionsMapper;

    @RequestMapping("/login")
    public String login(HttpServletRequest request) {
        String msg = "";
        String userName = request.getParameter("userName");//判断是否为空
        String password = request.getParameter("passWord");
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        //把用户信息序列化保存到cookie中，并不是保存账号密码,当用户
        //但是这个记住，每次重启服务的时候，shiro会生成新的加密秘钥，导致老的cookie用新秘钥解密报错
        token.setRememberMe(true);
        Subject subject = SecurityUtils.getSubject();

        try {
            subject.login(token);
            //subject.logout();
            if (subject.isAuthenticated()) {
                return "success";
            } else {
                return "test1";
            }
        } catch (IncorrectCredentialsException e) {
            msg = "登录密码错误. Password for account " + token.getPrincipal() + " was incorrect.";
            System.out.println(msg);
        } catch (ExcessiveAttemptsException e) {
            msg = "登录失败次数过多";
            System.out.println(msg);
        } catch (LockedAccountException e) {
            msg = "帐号已被锁定. The account for username " + token.getPrincipal() + " was locked.";
            System.out.println(msg);
        } catch (DisabledAccountException e) {
            msg = "帐号已被禁用. The account for username " + token.getPrincipal() + " was disabled.";
            System.out.println(msg);
        } catch (ExpiredCredentialsException e) {
            msg = "帐号已过期. the account for username " + token.getPrincipal() + "  was expired.";
            System.out.println(msg);
        } catch (UnknownAccountException e) {
            msg = "帐号不存在. There is no user with username of " + token.getPrincipal();
            System.out.println(msg);
        } catch (UnauthorizedException e) {
            msg = "您没有得到相应的授权！" + e.getMessage();
            System.out.println(msg);
        }
        return "test1";
    }

    @RequestMapping("/admin")
    public String admins(){
        return "admin";
    }

    @RequestMapping("/select")
    public String select(HttpServletRequest request, HttpServletResponse response){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + ":" + cookie.getMaxAge());
        }
        Cookie cookie = new Cookie("cookieTest", "cookie60*60");
        cookie.setMaxAge(60 * 60);
        cookie.setHttpOnly(true);
        cookie.setSecure(false);
        response.addCookie(cookie);
        return "select";
    }

    @RequestMapping("/update")
    @RequiresPermissions(value = {"user:update"})
    public String update(){
        return "update";
    }

    @RequestMapping("/unAuthorized")
    public String unAuthorized(){
        return "unAuthorized";
    }

    @RequestMapping("/session/get/{id}")
    public Sessions getSession(@PathVariable("id")String id){
        return sessionsMapper.selectById(id);
    }

    @RequestMapping("/session/update/{id}")
    public int updateById(@PathVariable("id")String id){
        Sessions sessions = new Sessions(id, "updateSession" + id);
        return sessionsMapper.updateById(sessions);
    }

    @RequestMapping("/session/delete/{id}")
    public int deleteById(@PathVariable("id")String id){
        return sessionsMapper.deleteById(id);
    }

    @RequestMapping("/session/insert/{id}")
    public int insertSession(@PathVariable("id")String id){
        Sessions sessions = new Sessions(id, "updateSession" + id);
        return sessionsMapper.insertSession(sessions);
    }

    @RequestMapping("/session/inserts")
    public int insertSessions(){
        List<Sessions> sessions = Arrays.asList(new Sessions("5", "updateSession5"), new Sessions("6", "updateSession6"));
        return sessionsMapper.insertSessions(sessions);
    }

    @RequestMapping("/session/updates")
    public int updateSessions(){
        Sessions sessions1 = new Sessions(null, "value");
        List<Sessions> sessions = Arrays.asList(new Sessions("5", "updateSession5"), new Sessions("6", "updateSession6"));
        sessions1.setSessionList(sessions);
        return sessionsMapper.updateSessions(sessions1);
    }

    @RequestMapping("/set/{value}")
    public void setValue(HttpServletRequest request, @PathVariable("value")String value){
        HttpSession session = request.getSession();
        session.setAttribute("shiro", value);
    }

    @RequestMapping("/get/value")
    public String getValue(HttpServletRequest request){
        HttpSession session = request.getSession();
        return (String) session.getAttribute("shiro");
    }
}

package com.springboot.tao.bean;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

/**
 * @author taozhiwei
 * @date 2020/9/1 16:38
 */
public class ShiroReaml extends AuthorizingRealm {

    public String getName() {
        return "TestRealm1";// 一般写reaml的名字
    }
    //该方法调用前提是，必须首先已经登录，然后在访问url需要验证权限时候才会进入该方法
    // 授权，必须得身份认证通过,该方法需要查询用户是否拥有权限和角色时候才会被调用
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //用户名
        Object primaryPrincipal = principals.getPrimaryPrincipal();
        System.out.println("permit-------------------" + primaryPrincipal.toString());
        //实际中应该是根据用户名从数据库查询角色权限
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRole("admin1");// 字符串添加单个角色用一个字符串，多个可以用集合
        info.addStringPermission("user:select");// 字符串添加单个权限用一个字符串，多个用集合
        //info.addStringPermission("user:update");
        // info.addObjectPermission();//以permission对象形式添加权限看
        return info;
    }

    // 身份认证，如果认证成功返回对象，如果失败返回null
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();// 用户输入的用户名
        // 根据账号从数据库查询对应密码（经过加盐处理）
        String password = new String((char[]) token.getCredentials());
        // 盐一般从数据库取出
        String salt = "tao";
        // 由于没用数据库，所以密码假设为123，对密码进行盐加密
        Md5Hash md5 = new Md5Hash("123", salt, 1024);
        System.out.println(password + username);
        // 第一参数账号不用加密，第二个参数是加密后的密码，第三个参数是盐,第四个是realm名字，只需要判断密码正确就可以登录，账号无关
        // shiro根据你ini里面md5的配置，将taken中的密码+传入的盐进行加密的到的加密密码和传入的数据库中的加密密码进行比对，判断是否登陆
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, md5, ByteSource.Util.bytes(salt), getName());
        //不加盐
         SimpleAuthenticationInfo info1 = new SimpleAuthenticationInfo(username, "123", getName());
        return info1;
    }
}

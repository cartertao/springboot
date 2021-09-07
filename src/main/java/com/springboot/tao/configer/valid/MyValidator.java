package com.springboot.tao.configer.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author: carter
 * @Date: 2021/9/7
 */
public class MyValidator implements ConstraintValidator<MyValid, Object> {
    private MyValid target;

    @Override
    public void initialize(MyValid constraintAnnotation) {

        target = constraintAnnotation;
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null) {
            return true;
        }
        try {
            // 验证
            if ( value != target.value())
                return false;
        }
        catch (Exception ex){
            return false;
        }
        return true;
    }
}

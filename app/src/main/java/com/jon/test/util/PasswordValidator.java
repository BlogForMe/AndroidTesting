package com.jon.test.util;

/**
 * Created by jon on 2/25/18.
 * 学习mock
 */

public class PasswordValidator {

    /**
     * mock普通方法
     *
     * @param password
     * @return
     */
    public boolean verifyPassword(String password) {
        return "jon".equals(password);
    }

    /**
     *  mock静态方法
     * @return
     */
    public static boolean isExist() {
        // do something
        return false;
    }


}

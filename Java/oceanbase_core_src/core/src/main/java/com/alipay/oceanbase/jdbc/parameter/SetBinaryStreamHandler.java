package com.alipay.oceanbase.jdbc.parameter;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 
 * 
 * @author liangjie.li
 * @version $Id: SetBinaryStreamHandler.java, v 0.1 Jun 7, 2013 7:19:51 PM liangjie.li Exp $
 */
public class SetBinaryStreamHandler implements ParameterHandler {

    /**
     * 
     * @see com.alipay.oceanbase.jdbc.parameter.ParameterHandler#setParameter(java.sql.PreparedStatement, java.lang.Object[])
     */
    public void setParameter(PreparedStatement stmt, Object[] args) throws SQLException {
        stmt.setBinaryStream((Integer) args[0], (InputStream) args[1], (Integer) args[2]);
    }
}

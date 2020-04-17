package Tamrin2;

import java.lang.reflect.Method;

public class connect {
    @connectionInfo(path = "jdbc:mysql:127.0.0.1/", dbName = "test",userName = "mmd",password = "09213016864")
    public void insertMethod() throws NoSuchMethodException {
        connect connect = new connect();
        Class<?> aclass = connect.getClass();
        Method method = aclass.getMethod("insertMethod");
        connectionInfo connectionInfo = method.getAnnotations(connectionInfo.class);
        String fullpatch = connectionInfo.path()+connectionInfo.dbName();
        String username=connectionInfo.userName();
        String password = connectionInfo.password();
    }


}

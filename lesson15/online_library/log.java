package lesson15.online_library;

public abstract class log {

    private LogData[] logDatas;


    public boolean logIn(String name, String password) {
        for (LogData temp : logDatas) {
            if (temp.getLoginUse() == true) {
                return false;
            }
        }

        for (LogData temp : logDatas) {
            if (temp.getLoginDataName() == name && temp.getLoginPassword() == password) {
                temp.setLoginUse(true);
                return true;
            }
        }
        return false;
    }
}
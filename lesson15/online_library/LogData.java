package lesson15.online_library;

public class LogData {
    private String loginDataName;
    private String loginPassword;
    private Boolean loginUse;

    public LogData(String loginDataName, String loginPassword, Boolean loginUse) {
        this.loginDataName = loginDataName;
        this.loginPassword = loginPassword;
        this.loginUse = loginUse;
    }

    public String getLoginDataName() {
        return loginDataName;
    }

    public void setLoginDataName(String loginDataName) {
        this.loginDataName = loginDataName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public Boolean getLoginUse() {
        return loginUse;
    }

    public void setLoginUse(Boolean loginUse) {
        this.loginUse = loginUse;
    }
}

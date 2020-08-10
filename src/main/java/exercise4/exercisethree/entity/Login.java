package exercise4.exercisethree.entity;

public class Login {
    private String user;
    private String password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String _user, String _password) {
        try {
            if (!(this.user.equals(_user)) || !(this.password.equals(_password))) {
                throw new Exception("Usuário ou senha incorretos.");
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

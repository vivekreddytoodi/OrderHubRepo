package applicationrunner.security;

class AuthRequest {
    private String username;
    private String password;

    String getUsername() {
        return "admin";
    }

    String getPassword() {
        return "admin123";
    }
}

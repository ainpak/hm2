public class User {

        private String username;
        private String password;


        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }


        public void registerUser(String username, String password) {
            if (username == null || username.trim().isEmpty() || username.contains(" ")) {
                throw new IllegalArgumentException("Invalid username: \"" + username + "\"");
            }

            if (password == null || password.length() < 8) {
                throw new IllegalArgumentException("Weak password: \"" + password + "\"");
            }


            this.username = username;
            this.password = password;
        }
    }



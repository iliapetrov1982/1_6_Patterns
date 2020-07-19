package builder;

public class AndroidExample {

    static class AlertDialog {
        private String title;
        private String message;
        private String icon;
        private boolean cancellable;

        public AlertDialog(String title, String message, String icon, boolean cancellable) {
            this.title = title;
            this.message = message;
            this.icon = icon;
            this.cancellable = cancellable;
        }


        public void show() {
            System.out.println(this);
        }

        @Override
        public String toString() {
            return "AlertDialog{" +
                    "title='" + title + '\'' +
                    ", message='" + message + '\'' +
                    ", icon='" + icon + '\'' +
                    ", cancellable=" + cancellable +
                    '}';
        }

        static class Builder {
            private String title;
            private String message;
            private String icon;
            private boolean cancellable;

            public Builder(Object o) {}

            public AlertDialog create() {
                return new AlertDialog(title, message, icon, cancellable);
            }

            public Builder setTitle(String title) {
                this.title = title;
                return this;
            }

            public Builder setMessage(String message) {
                this.message = message;
                return this;
            }

            public Builder setIcon(String icon) {
                this.icon = icon;
                return this;
            }

            public Builder setCancellable(boolean cancellable) {
                this.cancellable = cancellable;
                return this;
            }
        }
    }

    public static void main(String[] args) {
        AlertDialog.Builder builder = new AlertDialog.Builder(null);
        builder.setTitle("New Title")
                .setMessage("Builder Pattern")
                .setIcon("Super icon")
                .setCancellable(false);

        AlertDialog alertDialog = builder.create();

        alertDialog.show();

    }
}

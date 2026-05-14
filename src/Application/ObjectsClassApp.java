package Application;

import java.util.Objects;

public class ObjectsClassApp {
    public static class Data {
        private String data;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;

            Data data1 = (Data) o;
            return Objects.equals(data, data1.data);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(data);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {

        Data data = new Data();
        data.setData("W175 Kawasaki");
        execute(data);

    }

    public static void execute(Data data) {
        /*if (data != null) {
            System.out.println(data.toString());
            System.out.println(data.hashCode());
        }*/

        // code above act the same like below
        System.out.println(data);
        System.out.println(Objects.hashCode(data));
    }
}

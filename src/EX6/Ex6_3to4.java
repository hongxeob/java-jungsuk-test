package EX6;

import com.sun.xml.internal.ws.api.pipe.Engine;

public class Ex6_3to4 {
    class Student {
        String name;
        int ban;
        int no;
        int kor;
        int eng;
        int math;

        public Student(String name, int ban, int no, int kor, int eng, int math) {
            this.name = name;
            this.ban = ban;
            this.no = no;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        int getTotal() {
            return (kor + eng + math);
        }
        float getAverage() {
            return (int) (getTotal() / 3f * 10 + 0.5) / 10f; // float 형이기 때문에 형변환 해주고,반올림을 해줘야한다.
        }

        public String info() {
            return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
        }
    }

}

package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws Exception {
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for (Method method : declaredMethods) {
            PrintAnnotation printAnnotation = method.getAnnotation
                    (PrintAnnotation.class);
            printLine(printAnnotation);

            method.invoke(new Service());

            printLine(printAnnotation);
        }
    }

    public static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation != null) {
            // number 속성값 얻기
            int number = printAnnotation.number();
            for (int i = 0; i < number; i++) {
                // value 속성값 얻기
                String value = printAnnotation.value();
                System.out.println(value);
            }
            System.out.println();
        }
    }
}

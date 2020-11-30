package bstorm.akimt.testNGtest;

import org.springframework.stereotype.Service;

@Service
public class ClassOne implements InterfaceOne {

    @Override
    public int dummyMethod(String dummyParam) {
        switch (dummyParam){
            case "case 1":
                return 1;
            case "case 2":
                return 2;
            case "case 3":
                return 3;
            default:
                return -1;
        }
    }
}

package bstorm.akimt.testNGtest;

import org.springframework.stereotype.Service;

@Service
public class ClassThree implements InterfaceThree{

    @Override
    public boolean dummyMethod(int a, int b) {
        return a == b;
    }

}

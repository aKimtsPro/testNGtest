package bstorm.akimt.testNGtest;

import org.springframework.stereotype.Service;

@Service
public class ClassTwo implements InterfaceTwo {

    @Override
    public void dummyMethod(int nbr) throws Exception {
        if(nbr != 0)
            throw new Exception("nbr must be = 0");
    }
}

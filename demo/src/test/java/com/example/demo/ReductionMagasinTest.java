package com.example.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.ReductionMagasin;
import org.junit.jupiter.api.Test;


@SpringBootTest
public class ReductionMagasinTest {

    @Test
    void montantArticle101_succes(){
        ReductionMagasin reductionMagasin = new ReductionMagasin();
        Assertions.assertEquals(true, reductionMagasin.estElligibleReduction(101, false));
    }

    @Test
    void montantArticle81_succes(){
        ReductionMagasin reductionMagasin = new ReductionMagasin();
        Assertions.assertEquals(true, reductionMagasin.estElligibleReduction(81, true));
        Assertions.assertEquals(false, reductionMagasin.estElligibleReduction(80, true));
    }


}



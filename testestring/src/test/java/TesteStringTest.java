import org.junit.Assert;
import org.junit.Test;

public class TesteStringTest {

    @Test
    public void entrada1(){
        TesteString testCena1 = new TesteString();
        final String res = testCena1.removeDuplicadasSemRepeticao("AABBBAACCCC");
        Assert.assertEquals(res, "ABC");
    }

    @Test
    public void entrada2(){
        TesteString testCena2 = new TesteString();
        final String res = testCena2.removeDuplicadasSemRepeticao("XXYYYZZ");
        Assert.assertEquals(res, "XYZ");
    }

    @Test
    public void entrada3(){
        TesteString testCena3 = new TesteString();
        final String res = testCena3.removeDuplicadasSemRepeticao("DYZZAABB");
        Assert.assertEquals(res, "DYZAB");
    }

    @Test
    public void entrada4(){
        TesteString testCena4 = new TesteString();
        final String res = testCena4.removeDuplicadasSemRepeticao("aABBYyyZz");
        Assert.assertEquals(res, "aABYyZz");
    }

    @Test
    public void entrada5(){
        TesteString testCena5 = new TesteString();
        final String res = testCena5.removeDuplicadasSemRepeticao("11222AAaa3");
        Assert.assertEquals(res, "12Aa3");
    }

}

import org.junit.Assert;

public class Test {

    @org.junit.Test

    public void testaSaque(){
        Bank banco = new Bank();
        banco.deposit(100.0);
        try{
            banco.withdrawal(50.0);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Assert.assertEquals(50.0,banco.getSaldo().doubleValue(),0);



    }
    @org.junit.Test(expected = Exception.class)
    public void testaSaqueNulo() throws Exception{
        Bank banco = new Bank();
        banco.deposit(50.0);
        banco.withdrawal(null);
        Assert.assertEquals(banco.getSaldo(),50.0,0);

    }

}

package Bank;

public class BalaIsNotEnException  extends Exception{
    BalaIsNotEnException(){
        super();
    }
    BalaIsNotEnException(String msg){
        super(msg);
    }
}

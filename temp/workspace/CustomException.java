package workspace;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Implement custom exception
public class CustomException  extends RuntimeException{

    String message;

    String errorCode;


    public  CustomException (String message, String errorCode){
        super();
        this.message=message;
        this.errorCode=errorCode;


    }


    public static void main(String[] args) {

        //---------------------------------------------------------
        // from below list print number starting with 1
        List<Integer> intList = List.of(1, 11, 21, 15);
        intList.stream().map(String::valueOf).filter(s -> s.startsWith("1")).forEach(System.out::println);

        //----------------------------------------------------------------------
        //from list of items find total qty of each fruit
        // o/p example {banana:30, orange: 10 .....}

        List<Item> items = List.of(new Item("apple", 10, new BigDecimal(9.99)),
                new Item("banana", 20, new BigDecimal(19.99)),
                new Item("orange", 10, new BigDecimal(29.99)),
                new Item("watermelon", 10, new BigDecimal(29.99)),
                new Item("papaya", 20, new BigDecimal(9.99)),
                new Item("apple", 10, new BigDecimal(9.99)),
                new Item("banana", 10, new BigDecimal(19.99)),
                new Item("apple", 20, new BigDecimal(9.99)));

        Map<String, Integer> itemTotalQuantity = items.stream().collect(Collectors.groupingBy(item -> item.name, Collectors.summingInt(item -> item.qty)));
        System.out.println("itemTotalQuantity::"+itemTotalQuantity);
    }
//----------------------------------------------------------------
//  implement feign client  with retry and recover
//    @RequestLine(GET /users)
//    List<User> getUsers();,
//
//    FeignBuilder.(user-service).
//
//
//    @retry(maxlimit = 5, @backoff (multiplier 5 , time=500))
//    List<User> getUsers();
//
//@recover()

}
class Item{
    String name;
    Integer qty;
    BigDecimal price;

    public Item(String name, Integer qty, BigDecimal price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
}


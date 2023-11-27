package co.finecode;

import io.jsonwebtoken.Claims;

@Deprecated
public class Main {
    public static void main(String args[]) {
        String jwt = App.createJWT("23145", "amf", "Test Claims", 10000000);
        System.out.println("JWT " + jwt);

        Claims claims = App.decodeJWT(jwt);
        System.out.println(claims);
    }
}

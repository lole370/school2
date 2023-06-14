package wb;

public class ipv6check {

    public static void main(String[] args) {
        String ip = "1:2:3:4::6:7:8:9";
        System.out.println(checkIP(ip));
    }

    public static boolean checkIP(String ipIn) {
        if ("".equals(ipIn)) {
            System.out.println("Leerer String");
            return false;
        }

        String ip = ipIn.toLowerCase();

        if((ip.startsWith(":") && !ip.startsWith("::")) || (ip.endsWith(":") && !ip.endsWith("::"))) {
            System.out.println("String hat ':' am Ende oder Anfang");
            return false;
        }

        String replacedIp = ip.replaceAll(":", "").replaceAll("([0-9a-f]*)", "");
        if(!replacedIp.equals("")) {
            System.out.println("Unerlaubte Zeichen: " + replacedIp);
            return false;
        }


        int amountDoubleDoubleDot = (ip.length() - ip.replaceAll("::", "").length()) / 2;
        if(amountDoubleDoubleDot > 1) {
            System.out.println("Mehr als 1 '::': " + amountDoubleDoubleDot);
            return false;
        }


        ip = ip.replaceAll("::", ":");
        String[] blocks = ip.split(":");


        if(blocks.length+amountDoubleDoubleDot > 8) {
            System.out.println("Mehr als 8 Blöcke: " + (blocks.length+amountDoubleDoubleDot));
            return false;
        }
        if(blocks.length < 8 && amountDoubleDoubleDot != 1) {
            System.out.println("Zu wenige Blöcke ohne '::' ");
            return false;
        }


        for(String b : blocks) {
            if(b.startsWith("0") || b.length() > 4) {
                System.out.println("Block zu lang oder mit führender 0: " + b);
                return false;
            }

        }



        return true;
    }

}

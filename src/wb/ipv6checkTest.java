package wb;

import static org.junit.jupiter.api.Assertions.*;
import static wb.ipv6check.checkIP;

class ipv6checkTest {

    @org.junit.jupiter.api.Test
    void testCheckIP() {
        assertTrue(checkIP("::1"));
        assertTrue(checkIP("::1:2:3"));
        assertTrue(checkIP("1::"));
        assertTrue(checkIP("1::2:3"));
        assertTrue(checkIP("::"));
        assertTrue(checkIP("fe80::abc:1"));
        assertTrue(checkIP("1:2:3:4:5:6:7:8"));
        assertTrue(checkIP("1:2::7:8"));


        assertFalse(checkIP(""));
        assertFalse(checkIP("abc"));
        assertFalse(checkIP("1234::abcd::1"));
        assertFalse(checkIP("12345::"));
        assertFalse(checkIP("abcd:0123:1234::"));
        assertFalse(checkIP("1:2:3:4:5:6:7:8:9"));
        assertFalse(checkIP("1:2:3:4:5:6:7"));
        assertFalse(checkIP(":1234:abc::"));
        assertFalse(checkIP("1234::abc:"));
        assertFalse(checkIP("abcdx::123"));
        assertFalse(checkIP("1:2:3:4::6:7:8:9"));
    }
}
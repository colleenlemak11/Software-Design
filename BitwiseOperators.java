package fundamentals;

public class BitwiseOperators {

    public static void main(String[] args) {
        
    	// & and needs both bits to be 1
    	// | or needs at least one of the two bits to be 1
    	// ^ xor is an exclusive or so one must be 0 and the other 1 for it to be 1
    	
    	// masking means getting specific parts of values 
    	// mask with 0s so if you want to get first 8 bits for an IP address, you do 8 bit 1s then 24 (3 other sections) of 0s
    	
        int binary = 0b10111010;                      // 0xBA, 186 decimal value
        int octal  = 010;                            // 0x08,   8 decimal value
        int hex    = 0x2F;                            // 0x2F,  47 decimal value
        int sum    = (binary + octal + hex);        // 0xF1, 241 decimal value
        
        System.out.println(binary + " (dec) is 0x" + String.format("%x", binary).toUpperCase() + " (hex) and 0b" + Integer.toBinaryString(binary) + " (bin)");
        System.out.println(octal + " (dec)  is 0x" + String.format("%x", octal).toUpperCase() + " (hex) and 0b" + Integer.toBinaryString(octal) + " (bin)");        
        System.out.println(hex + " (dec) is 0x" + String.format("%x", hex).toUpperCase() + " (hex) and 0b" + Integer.toBinaryString(hex) + " (bin)");        
        System.out.println(sum + " (dec) is 0x" + String.format("%x", sum).toUpperCase() + " (hex) and 0b" + Integer.toBinaryString(sum) + " (bin) \n");
                        
        int r1 = sum & 0xD8;    // 0xF1 & 0xD8 = 0xD0
        int r2 = sum | 0xA7;    // 0xF1 | 0xA7 = 0xF7
        int r3 = sum ^ 0x5A;    // 0xF1 ^ 0x5A = 0xAB    
        
        System.out.println("Sum & 0xD8 is " + r1 + " (dec) 0x" + String.format("%x", r1).toUpperCase() + " (hex) and 0b" + Integer.toBinaryString(r1) + " (bin)");
        System.out.println("Sum | 0xA7 is " + r2 + " (dec) 0x" + String.format("%x", r2).toUpperCase() + " (hex) and 0b" + Integer.toBinaryString(r2) + " (bin)");
        System.out.println("Sum ^ 0x5A is " + r3 + " (dec) 0x" + String.format("%x", r3).toUpperCase() + " (hex) and 0b" + Integer.toBinaryString(r3) + " (bin)");                    
        System.out.println("");
        
        // bit shifting and masking
        
        // decimal, binary, hexadecimal, IP
        

   }
}
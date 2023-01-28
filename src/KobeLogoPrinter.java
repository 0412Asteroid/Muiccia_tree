public class KobeLogoPrinter {
    int size;
    String symbol = "b";
    String space = " ";

    public KobeLogoPrinter(int numberOfLogoRows) {
        size = numberOfLogoRows;
    }

    void printLogo() {
        for (int LogoRowNumber = 0; LogoRowNumber < size; LogoRowNumber++) {
            this.printLogoRow(LogoRowNumber);
        }
    }

    private void printLogoRow(int logoRow) {
        String row = "";
        // insert front space
        int frontSpaceLength = size-logoRow-1;
        for (int i = 0; i < frontSpaceLength; i++) {
            row += space;
        }
        // insert first symbol 1
        row += symbol;
        row = rowAfterAppendedMiddleSpaceAndEndSymbol(row, logoRow);
        if(logoRow != size-1){
            // middle space
            int middleSpaceLength =( size - 1 - logoRow)*2 - 1;
            for (int i = 0; i < middleSpaceLength; i++) {
                row += space;
            }

            // start symbol 2
            row += symbol;
        }
        row = rowAfterAppendedMiddleSpaceAndEndSymbol(row, logoRow);
        System.out.println(row);
    }

    String rowAfterAppendedMiddleSpaceAndEndSymbol(String row, int logoRow){
        if (logoRow != 0){
            // insert middle space 1
            int middleSpaceLength = logoRow * 2 - 1;
            for (int i = 0; i < middleSpaceLength; i++) {
                row += space;
            }
            // end symbol 1
            row += symbol;
        }
        return row;
    }
}

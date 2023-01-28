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

    private int nLogoLength(int rowNum) {
        return rowNum * 2 + 1;
    }

    private int middleSpaceLength(int rowNum) {
        return rowNum * 2 - 1;
    }

    private void printLogoRow(int logoRow) {
        String row = "";
        // insert front space
        int frontSpaceLength = size-logoRow-1;
        for (int i = 0; i < frontSpaceLength; i++) {
            row += space;
        }
        // insert first symbol
        row += symbol;
        // insert middle space
        int middleSpaceLength = size-2;
        for (int i = 0; i < middleSpaceLength; i++) {
            row += space;
        }
        // end symbol
        row += symbol;
        System.out.println(row);
    }
}

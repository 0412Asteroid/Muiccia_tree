public class TreePrinter {
    int numberOfLeavesRowsToPrint;
    String leavesSymbol = "l";
    String chunkSymbol = "c";
    String space = " ";

    public TreePrinter(int numberOfLeavesRows) {
        numberOfLeavesRowsToPrint = numberOfLeavesRows;
    }

    void print() {
        printLeaves();
        printChunk();
    }
    void printLeaves(){
        for (int LeavesRowNumber = 0; LeavesRowNumber < numberOfLeavesRowsToPrint; LeavesRowNumber++) {
            this.printLeavesRow(LeavesRowNumber);
        }
    }

    void printChunk(){
        int chunkRowsHeight = numberOfLeavesRowsToPrint/2;
        for (int i= 0; i < chunkRowsHeight; i++){
            this.printChunkRow() ;
        }
    }

    private int nLeavesRowLength(int rowNum) {
        return rowNum * 2 + 1;
    }

    int getLastRowLength(){
        return nLeavesRowLength(numberOfLeavesRowsToPrint-1);
    }

    private void printLeavesRow(int rowNum) {
        int currentLeavesRowLength = nLeavesRowLength(rowNum);
        int spaceLeavesLength = ( getLastRowLength() - currentLeavesRowLength) / 2;
        String row = "";
        for (int i = 0; i < spaceLeavesLength; i++) {
            row += this.space;
        }
        for (int i = 0; i < currentLeavesRowLength; i++) {
            row += this.leavesSymbol;
        }
        System.out.println(row);
    }
    private void  printChunkRow() {
        int chunkSymbolRowLength = (int) getLastRowLength()/2;
        int chunkSpacesLength = getLastRowLength() - chunkSymbolRowLength;
        String chunkRow = "";
        for (int i = 0; i < chunkSpacesLength/2;i++){
            chunkRow += this.space;
        }
        for (int i =0; i< chunkSymbolRowLength;i++){
             chunkRow += chunkSymbol;
        }
        System.out.println(chunkRow);
    }
}

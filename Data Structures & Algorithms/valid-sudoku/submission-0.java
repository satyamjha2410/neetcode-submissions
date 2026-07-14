class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> col = new HashMap<>();
        Map<Integer, Set<Character>> block = new HashMap<>();

        int len = board.length;
        int size = (int) (Math.sqrt(len));

        System.out.println("len " + len + " size " + size );
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                Character ch = board[i][j];
                if(ch == '.'){
                    continue;
                }
                if (checkRow(rows, ch, i) || checkCol(col, ch, j)
                    || checkBlock(block, ch, i, j, size)) {
                    return false;
                }
                rows.computeIfAbsent(i, k -> new HashSet<>()).add(ch);
                col.computeIfAbsent(j, k -> new HashSet<>()).add(ch);
                block.computeIfAbsent(getBoardKey(i, j, size), k -> new HashSet<>()).add(ch);
            }
        }
        return true;
    }

    private int getBoardKey(int i, int j, int size) {
        int i1 = i / size;
        int j1 = j / size;
        return i1 * size + j1;
    }
    private boolean checkRow(Map<Integer, Set<Character>> rows, char ch, int i) {
        return rows.containsKey(i) && rows.get(i).contains(ch);
    }
    private boolean checkCol(Map<Integer, Set<Character>> col, char ch, int j) {
        return col.containsKey(j) && col.get(j).contains(ch);
    }
    private boolean checkBlock(
        Map<Integer, Set<Character>> block, char ch, int i, int j, int size) {
        int key = getBoardKey(i, j, size);
        return block.containsKey(key) && block.get(key).contains(ch);
    }
}

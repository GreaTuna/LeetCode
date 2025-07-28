class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        LinkedList<LinkedList<Integer>> result = new LinkedList<>(
            Arrays.stream(matrix)
            .map(row -> new LinkedList<>(Arrays.stream(row).boxed().toList()))
            .toList()
        );

        ArrayList<Integer> newList = new ArrayList<>();
        return aboba(result, newList);
    }

    private List<Integer> aboba(LinkedList<LinkedList<Integer>> list, List<Integer> newList) {
        int size = list.size(); 
        if (size == 0) {
            return newList;
        }

        LinkedList<Integer> first = list.getFirst();
        while (!first.isEmpty()) {
            newList.add(first.removeFirst());
        }
        list.removeFirst();
        --size;

        for (int i = 0; i < size; i++) {
            if (!list.get(i).isEmpty()) {
                newList.add(list.get(i).removeLast());
            }
        }

        if (list.isEmpty()) {
            return newList;
        }

        LinkedList<Integer> last = list.getLast();
        while (!last.isEmpty()) {
            newList.add(last.removeLast());       
        }
        list.removeLast();
        --size;

        for (int i = size - 1; i >= 0; i--) {
            if (!list.get(i).isEmpty()) {
                newList.add(list.get(i).removeFirst());
            }
        }

        return aboba(list, newList);
    }
}
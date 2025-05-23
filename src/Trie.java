
class TrieNode {
    private TrieNode [] children;
    private boolean isWord;

    public TrieNode(){
        isWord = false;
        children = new TrieNode[26];
    }

    public TrieNode[] getChildren() {
        return children;
    }

    public TrieNode getChild(int idx) {
        return children[idx];
    }
    public void setChild(int idx){
        children[idx] = new TrieNode();
    }

    public void setChildren(TrieNode[] children) {
        this.children = children;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }
}

public class Trie {
    TrieNode start;

    public Trie(){
        start = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = start;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)- 'a';

            if(node.getChild(idx) == null){
                node.setChild(idx);
            }
            node = node.getChild(idx);
        }

        node.setWord(true);
    }

    public boolean search(String word) {
        TrieNode node = start;

        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)- 'a';
            if(node.getChild(idx) == null){
                return false;
            }
            node = node.getChild(idx);
        }
        return node.isWord();
    }

    public boolean startsWith(String prefix) {
        TrieNode node = start;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';

            if(node.getChild(idx) == null){
                return false;
            }
            node = node.getChild(idx);
        }

        return true;
    }
}

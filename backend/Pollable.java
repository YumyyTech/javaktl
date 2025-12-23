package backend;

public interface Pollable {
    void addVote(int optionIndex) throws Exception;
    int getVoteCount(int optionIndex);
    String getQuestion();
    String[] getOptions();
}
    


package Main;


import javax.swing.SwingUtilities;

public class Main {
    public static <VotingFrame> void main(final String[] args) {
        SwingUtilities.invokeLater(VotingFrame::new);
    }
}
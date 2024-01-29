public class ClientA {
    public static void main(String[] args) {
        MultimediaFacade multimediaFacade = new MultimediaFacade();
        System.out.println("Watching movie");
        multimediaFacade.watchMovie("VideFile","AudioFile","subtitleFile");
        System.out.println("Listening songs ");
        multimediaFacade.listeningSongs("AudioFile");
    }
}

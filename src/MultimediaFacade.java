public class MultimediaFacade {

    private VideoPlayer videoPlayer;
    private AudioPlayer audioPlayer;
    private StreamingService streamingService;
    private SubtitleService subtitleService;
    private Display display;

    public MultimediaFacade() {
        this.videoPlayer = new VideoPlayer();
        this.audioPlayer = new AudioPlayer();
        this.streamingService = new StreamingService();
        this.subtitleService = new SubtitleService();
        this.display = new Display();
    }

    public void watchMovie(String videoFile, String audiFile, String subtitleFile){

        videoPlayer.playVideo(videoFile);
        audioPlayer.playAudio(audiFile);
        subtitleService.displayingSubtitle(subtitleFile);
  }

  public  void listeningSongs(String audioFile){
        audioPlayer.playAudio(audioFile);
  }
}

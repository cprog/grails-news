package magicnews

class MNews {
    String title;
    String newsabstract
    String fulltxt

    static mapping = {
        fulltxt sqlType: 'text'
        newsabstract sqlType: 'text'

    }

    static constraints = {
    }
}

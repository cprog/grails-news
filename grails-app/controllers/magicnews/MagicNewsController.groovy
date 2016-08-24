package magicnews


class MagicNewsController {
    static defaultAction = "home"
    def home() {
        render "<h1> Real Programmers do not eat Quiche</h1>"
    }
    def random() {
        render MNews.list()
    }
}

package magicnews


class MagicNewsController {
    static defaultAction = "home"
    def home() {
        [allnews:MNews.list()]
    }
    def random() {
        [currentnews: MNews.get(params.tid)]
    }
}

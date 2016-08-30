class BootStrap {

    def init = { servletContext ->
        new magicnews.MNews(title: 'This news is always loaded',
                            newsabstract: "This abstract is always inserted",
                            fulltxt: "This fulltxt is always loaded").save()

        new magicnews.MNews(title: 'Donec sodales porta orci,',
                            newsabstract: '''Phasellus dapibus sapien sit amet quam maximus imperdiet. Curabitur non mauris eros. Etiam risus sem, semper in dapibus eu, convallis nec est. Sed viverra ligula non ante dignissim malesuada. Donec bibendum, lacus a pulvinar condimentum, mauris arcu posuere turpis, vitae ultricies ligula mi eget enim. Praesent placerat hendrerit tempus. Nullam non sapien at tellus efficitur commodo. Donec sodales porta orci, a tempus dolor''',
                             fulltxt: '''ed vulputate dui lorem, vel bibendum purus maximus hendrerit. Nullam laoreet faucibus est, vel tincidunt orci condimentum nec. Duis blandit posuere arcu, eget mattis lectus rhoncus eu. Sed commodo pellentesque dui, sed dignissim elit commodo eu. Nam laoreet lobortis hendrerit. Aenean vulputate velit non mauris pretium ultrices. Integer hendrerit ante a est bibendum consequat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Vivamus facilisis arcu et suscipit consectetur. ''').save()
    }
    def destroy = {
    }
}

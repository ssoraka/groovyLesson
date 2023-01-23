package com.dima.mail

import static com.dima.mail.DslBuilder.*

mail {
    from "to@mail.ru"
    to "from@mail.ru"
    title "title"
    body {
        text "text of the letter"
        images (["image.jpg", "image2.png"])
        image "image.jpg"
    }
}

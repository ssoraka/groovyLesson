package com.dima

trait WithId {
    Integer id

    boolean validatedId() {
        id > 0
    }
}
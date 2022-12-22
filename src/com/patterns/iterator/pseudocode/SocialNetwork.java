package com.patterns.iterator.pseudocode;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);
    ProfileIterator createCoworkersIterator(String profileEmail);
}

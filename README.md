# Stock Recommender
Created by Bryan Hwu

## Overview
Welcome to my stock recommender Java project! The final vision is still tbd. 

## Pre-requisites
#### Java
[Java 8+](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

## Vision

### Epic Level Idea

Be able to chose a set of stock symbols and date and see net profit or loss

### Work Items
[New] Config file system

[New] Caffeine caches that store recent stock data

[In Progress] Ability to query for symbol and dates of stock history

[DONE] Serialization / Deserialization of stock history data

[DONE] Serialization / Deserialization of market exchange data

[DONE] Caffeine caches that store recent market summary data

[DONE] Create mock data for testing

[DONE] CLI that allows you to query for stock information

____________________
Backlog:
* Implement Spring config files to be able to read in local configs
* Service that allows you to bundle together stocks and see how much you would've made
* Stock that clusters together stocks by industry and recommends ones;
* Largest stock price increase, value, etc
## JAR Versions and Release Notes

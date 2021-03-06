(ns dev.b-issues.open
  (:require [dev.util :refer-macros [defeditor]]))

; NOTE: add new issues to the bottom of this file.

(defeditor
 arrow-key-navigation-breaks-on-links
 "Put the cursor at the end of a newline and try going back (arrow <-).
  The **bold link** does not seem to be allowing the left arrow
  to properly move the caret. This seems to be specific to links
  with marks

  Going up and down is also failing when the caret is on a link."
 [:document
  [:paragraph
   [:bold
    "allows "
    [:link {:url "http://google.com"} "arrow nav"]
    ", breaks "
    [:link {:url "http://google.com"} "at end"]]]
  [:paragraph
   [:italic
    "allows "
    [:link {:url "http://google.com"} "arrow nav"]
    ", breaks "
    [:link {:url "http://google.com"} "at end"]]]
  [:paragraph
   [:strikethrough
    "allows "
    [:link {:url "http://google.com"} "arrow nav"]
    ", breaks "
    [:link {:url "http://google.com"} "at end"]]]
  [:paragraph]
  [:paragraph
   "allows "
   [:link {:url "http://google.com"} "arrow nav"]
   ", still works! "
   [:link {:url "http://google.com"} "at end"]]
  [:paragraph
   "up & down sill broken here too "
   [:link {:url "http://google.com"} "link"]]])

(defeditor
 multiple-editors-on-the-same-page-break-link-hover-menu-part-1
 "Part 1. Selecting some text and clicking the link button opens a hover-menu in every editor on the page."
 [:document [:paragraph "\nSelect me and make me a link.\n"]])
(defeditor
 multiple-editors-on-the-same-page-break-link-hover-menu-part-2
 "Part 2. See part 1."
 [:document [:paragraph "\nMy link hover-menu opens even when I'm not in focus.\n"]])

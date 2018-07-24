(ns utils.slate
  (:require [reagent.core :as reagent]
            ["slate" :as slate]
            ["slate-react" :refer (Editor)]))

(def editor (reagent/adapt-react-class Editor))

(defn edn->slate [edn-slate-document] (slate/Value.fromJSON (clj->js edn-slate-document)))

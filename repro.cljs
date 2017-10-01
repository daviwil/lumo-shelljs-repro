(ns lumo-shelljs-repro.core
  (:require
    [shelljs :as shell]))

(.exec shell "echo 'Testing repro!'")

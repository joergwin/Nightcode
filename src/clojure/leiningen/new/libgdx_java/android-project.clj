(defproject {{app-name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  
  :dependencies [[com.badlogicgames.gdx/gdx "0.9.9-SNAPSHOT"
                  :use-resources true]
                 [com.badlogicgames.gdx/gdx-backend-android "0.9.9-SNAPSHOT"]]
  :repositories [["sonatype"
                  "https://oss.sonatype.org/content/repositories/snapshots/"]]
  :profiles {:dev {:android {:aot :all-with-unused}}
             :release {:android
                       {;; Specify the path to your private
                        ;; keystore and the the alias of the
                        ;; key you want to sign APKs with.
                        ;; :keystore-path "/home/user/.android/private.keystore"
                        ;; :key-alias "mykeyalias"
                        :aot :all}}}
  
  :android {;; Specify the path to the Android SDK directory either
            ;; here or in your ~/.lein/profiles.clj file.
            ;; :sdk-path "/home/user/path/to/android-sdk/"
            
            ;; Uncomment this if dexer fails with OutOfMemoryException
            ;; :force-dex-optimize true
            
            :assets-path "../desktop/resources"
            :native-libraries-paths ["libs"]
            :target-version "{{target-sdk}}"}
  
  :java-source-paths ["src" "../desktop/src-common" "gen"]
  :java-only true)

(with-open-file (str "./newFile.txt" :direction :output :if-exists :supersede :if-does-not-exist :create)(format str "write anything ~%"))

(with-open-file 
 (str "./newFile.txt" 
      :direction :output 
      :if-exists :supersede :if-does-not-exist :create)(format str "~S" (list 1 2 3)))

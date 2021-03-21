File(String pathName);
File(File parent , String child)
File(String parent , String child)
File(URI uri)

file.createNewFile() throws IoException : boolean 

file.exists() : boolean

file.canWrite() : boolean
file.setWritable(boolean writable) : boolean
file.setWritable(boolean writable , boolean owner) : boolean

file.canRead() : boolean
file.setReadable(boolean readable) : boolean
file.setReadable(boolean readable , boolean owner) : boolean

file.canExecute() : boolean
file.setExecutable(boolean ex) : boolean
file.setExecutable(boolean ex , boolean owner) : boolean

file.isAbsolute() : boolean
file.getPath() : String pathName

file.isDirectory() : boolean


file.isFile() : boolean

file.getName() : String 

file.getParent() : String
file.getParentFile() : File

file.toPath() : Path

file.toURI() : URI

file.listFiles() : File[]

file.getFreeSpace() : long

file.list(FileNameFilter filter) : String[]

file.mkdir() : boolean

file.delete() : boolean
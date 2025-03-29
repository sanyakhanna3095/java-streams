# Java Streams
- provides a set of I/O(input/output) classes to read and write data
- part of the Java 8 Stream API
- functional programming approach of processing collections of data
- classes are part of the java.io package
- A stream represents a sequence of data and can be used for reading from or writing to a data source or destination.
- perform operations like filtering, mapping, and reducing in a declarative and efficient manner.


#### Streams operate on data but do not modify the original source.
- They create new sequences (streams or collected results).
- If modification is needed, use Collectors.toList() or collect().
- To retain modifications, you must collect the result.
___

### Key Characteristics of Streams:  
1. Not a Data Structure: It does not store data.
2. Functional Processing: Uses functional-style operations. 
3. Lazy Evaluation: Operations are executed only when needed. 
4. Parallel Execution: Supports parallel processing for performance.

___
## Categories:
1. Byte stream -> Work with binary data (8-bit bytes)
2. Character stream -> Work with character data (16-bit Unicode characters)

---
#### A. File Streams
read/write data directly from/to files  
- Byte Streams :  
    - FileInputStream : Reads bytes from a file
    - FileOutputStream: Writes bytes to a file
    - Use Case: Binary files (e.g., images, PDFs)
- Character Streams :
  - FileReader: Reads characters from a text file
  - FileWriter: Writes characters to a text file
  - Use Case: Text files with proper character encoding
---

#### B. Object Streams  
Serialize/deserialize Java objects (convert objects to bytes and vice versa)

- ObjectInputStream: Reads serialized objects. 
- ObjectOutputStream: Writes serialized objects.
- Requirements: Objects must implement a Serializable interface.

---
#### C. Byte Array Streams  
Use byte arrays as the source/destination in memory.
- ByteArrayInputStream: Reads from a byte array. 
- ByteArrayOutputStream: Writes to a byte array. 
- Use Case: In-memory data manipulation (e.g., network protocols).


---
#### D. Buffered Streams  
improve I/O performance by reducing the number of I/O operations through buffering
- BufferedInputStream & BufferedOutputStream: byte streams that add buffering to the underlying input and output streams
- BufferedReader & BufferedWriter: These are character streams that add buffering to the underlying reader and writer.


---
#### E. Reader & Writer
abstract classes for reading and writing character streams
- InputStreamReader and OutputStreamWriter: bridge between byte streams and character streams.
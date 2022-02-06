package com.simbirsoft.intership.koeshov.controller;

//public class ParserController {
//        private static Document getPage() throws IOException {
//            String url = "https://jsoup.org";
//            Document page = Jsoup.parse(new URL(url), 3000);
//            return page;
//        }
//
//        public static void main(String[] args) throws IOException {
//            ArrayList<String> listOfSeparators = new ArrayList<String>();
//            listOfSeparators.add(" ");
//            listOfSeparators.add(",");
//            listOfSeparators.add(".");
//            listOfSeparators.add("!");
//            listOfSeparators.add("?");
//            listOfSeparators.add("(");
//            listOfSeparators.add(")");
//            listOfSeparators.add("[");
//            listOfSeparators.add("]");
//            listOfSeparators.add("-");
//            listOfSeparators.add(";");
//            listOfSeparators.add(":");
//            listOfSeparators.add("\n");
//            listOfSeparators.add("\r");
//            listOfSeparators.add("\t");
//            //System.out.println(getPage());
//
//            String pagetext = getPage().text();
//            String separatorsString = String.join("|\\", listOfSeparators);
//            Map<String, Word> countMap = new HashMap<String, Word>();
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(pagetext.getBytes(StandardCharsets.UTF_8))));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] words = line.split(separatorsString);
//                for (String word : words) {
//                    if ("".equals(word)) {
//                        continue;
//                    }
//
//                    Word wordObj = countMap.get(word);
//                    if (wordObj == null) {
//                        wordObj = new Word();
//                        wordObj.word = word;
//                        wordObj.count = 0;
//                        countMap.put(word, wordObj);
//                    }
//
//                    wordObj.count++;
//                }
//            }
//
//            reader.close();
//
//            SortedSet<Word> sortedWords = new TreeSet<Word>(countMap.values());
//
//            for (Word word : sortedWords) {
//                System.out.println(word.count + "\t" + word.word);
//            }
//        }
//        public static class Word implements Comparable<Word> {
//            String word;
//            int count;
//
//            @Override
//            public int hashCode() { return word.hashCode(); }
//
//            @Override
//            public boolean equals(Object obj) { return word.equals(((Word)obj).word); }
//
//            @Override
//            public int compareTo(Word b) { return b.count - count; }
//        }
//    }


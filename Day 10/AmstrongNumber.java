

class AmstrongNumber
{
	public static void main(String args[]){
		
		for(int i=100; i<=1000; i++)
		{
			int num = i;
			int result = AmstrongNumber.checkAmstrong(num);
			
			if(num == result){
				System.out.println( i + " Amstrong Number");
			}
			
		}
		
	
	
	}
	
	public static int checkAmstrong(int num){
		int n = num;
		int sum = 0;
		while(n>0){

			int lastDigit = n%10;
			int cubrt = (int) Math.pow(lastDigit, 3);
			sum = sum + cubrt;
			n = n / 10;
		}
	
		return sum;
	}
}


/*

output:
100 Not amstrong
101 Not amstrong
102 Not amstrong
103 Not amstrong
104 Not amstrong
105 Not amstrong
106 Not amstrong
107 Not amstrong
108 Not amstrong
109 Not amstrong
110 Not amstrong
111 Not amstrong
112 Not amstrong
113 Not amstrong
114 Not amstrong
115 Not amstrong
116 Not amstrong
117 Not amstrong
118 Not amstrong
119 Not amstrong
120 Not amstrong
121 Not amstrong
122 Not amstrong
123 Not amstrong
124 Not amstrong
125 Not amstrong
126 Not amstrong
127 Not amstrong
128 Not amstrong
129 Not amstrong
130 Not amstrong
131 Not amstrong
132 Not amstrong
133 Not amstrong
134 Not amstrong
135 Not amstrong
136 Not amstrong
137 Not amstrong
138 Not amstrong
139 Not amstrong
140 Not amstrong
141 Not amstrong
142 Not amstrong
143 Not amstrong
144 Not amstrong
145 Not amstrong
146 Not amstrong
147 Not amstrong
148 Not amstrong
149 Not amstrong
150 Not amstrong
151 Not amstrong
152 Not amstrong
153 Amstrong Number
154 Not amstrong
155 Not amstrong
156 Not amstrong
157 Not amstrong
158 Not amstrong
159 Not amstrong
160 Not amstrong
161 Not amstrong
162 Not amstrong
163 Not amstrong
164 Not amstrong
165 Not amstrong
166 Not amstrong
167 Not amstrong
168 Not amstrong
169 Not amstrong
170 Not amstrong
171 Not amstrong
172 Not amstrong
173 Not amstrong
174 Not amstrong
175 Not amstrong
176 Not amstrong
177 Not amstrong
178 Not amstrong
179 Not amstrong
180 Not amstrong
181 Not amstrong
182 Not amstrong
183 Not amstrong
184 Not amstrong
185 Not amstrong
186 Not amstrong
187 Not amstrong
188 Not amstrong
189 Not amstrong
190 Not amstrong
191 Not amstrong
192 Not amstrong
193 Not amstrong
194 Not amstrong
195 Not amstrong
196 Not amstrong
197 Not amstrong
198 Not amstrong
199 Not amstrong
200 Not amstrong


*/
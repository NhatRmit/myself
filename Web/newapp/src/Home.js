import BlogList from './BlogList'
import useFetch from './useFetch'

const Home = () => {
    
    const { data:blogs , isPending, error} = useFetch("http://localhost:8000/blogs")

    //every render => useEffect run, rerender useEffect run
    return ( 
        <div className="home">
            {error && <div>{ error }</div>}
            {isPending && <div>Loading...</div>}
            {blogs && <BlogList blogs={ blogs } title="All Blogs!" />}
        </div>
    )
}
 
export default Home;